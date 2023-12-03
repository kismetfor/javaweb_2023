package com.servlet.rain.database;
import java.util.List;


public class PageModel<E> {
    //结果集
    private List<E> list;

    //查询记录数
    private int totalSize;
    //每页多少条数据
    private int pageSize;
    //第几页
    private int pageNum;

    public int getTotalPages() {
        return (totalSize % pageSize == 0 ? (totalSize / pageSize) : (totalSize / pageSize + 1));
    }
    public int getTopPageNum() {
        return 1;
    }
    public int getPreviousPageNum() {
        return pageNum >= 1 ? pageNum - 1 : 1;
    }
    public int getNextPageNum() {
        return pageNum >= getTotalPages() ? getTotalPages() : pageNum + 1;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}

