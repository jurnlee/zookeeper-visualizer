package com.xin;

import com.xin.util.match.FList;
import com.xin.util.match.TextRange;
import com.xin.view.FilterableTreeItem;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linxixin@cvte.com
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class ZkNode {

    private String             path;
    private String             name;
    private boolean            isHighLight;
    private boolean            childExpand;
    private FList<TextRange>   matchSegments;
    private List<ZkNode>       children;
    private ZkNode             parent;
    private FilterableTreeItem treeItem;

    public ZkNode(String path, String name) {
        this.path = path;
        this.name = name;
        isHighLight = true;
        childExpand = false;
        matchSegments = FList.emptyList();
    }

    public ZkNode getParent() {
        return parent;
    }

    public void setParent(ZkNode parent) {
        this.parent = parent;
    }

    public void setHighLight(boolean highLight) {
        isHighLight = highLight;
    }

    public FList<TextRange> getMatchSegments() {
        return matchSegments;
    }

    public void setMatchSegments(FList<TextRange> matchSegments) {
        this.matchSegments = matchSegments;
    }

    public void addChild(ZkNode zkNode) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(zkNode);
    }

    @Override
    public String toString() {
        return name;
    }

    public FilterableTreeItem getTreeItem() {
        return treeItem;
    }

    public void setTreeItem(FilterableTreeItem treeItem) {
        this.treeItem = treeItem;
    }
}
