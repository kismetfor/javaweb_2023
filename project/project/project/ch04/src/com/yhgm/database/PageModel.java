package com.yhgm.database;

import java.util.List;

/**
 * Author:yanghua
 * Date:2023/10/26 14:35
 */
public class PageModel<T> {
    private List<T> list;
    private Integer totalSize;
    private Integer page;
    private Integer size;

    @Override
    public String toString() {
        return "PageModel{" +
                "list=" + list +
                ", totalSize=" + totalSize +
                ", page=" + page +
                ", size=" + size +
                '}';
    }

    public PageModel() {
    }

    public PageModel(List<T> list, Integer totalSize, Integer page, Integer size) {
        this.list = list;
        this.totalSize = totalSize;
        this.page = page;
        this.size = size;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPages() {
        return (totalSize % size == 0 ? (totalSize / size) : (totalSize / size + 1));
    }
    public Integer getTopPageNum() {
        return 1;
    }
    public Integer getPreviousPageNum() {
        return page > 1 ? page - 1 : 1;
    }
    public Integer getNextPageNum() {
        return page >= getTotalPages() ? getTotalPages() : page + 1;
    }
}
