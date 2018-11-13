package com.nikai.order.dto;

import java.util.List;
import java.util.Map;

public class MultiTypeDto<E, T, Z> {

    private Long id;
    private Map<String, E> eMap;
    private List<T> tList;
    private Z data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, E> geteMap() {
        return eMap;
    }

    public void seteMap(Map<String, E> eMap) {
        this.eMap = eMap;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }

    public Z getData() {
        return data;
    }

    public void setData(Z data) {
        this.data = data;
    }
}
