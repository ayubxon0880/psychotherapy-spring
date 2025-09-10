package uz.psychotherapy.psychotherapybackend.dto.request;

import uz.psychotherapy.psychotherapybackend.dto.SortEnum;

public abstract class FilterRequest {
    private int id;
    private int page;
    private int size;
    private SortEnum sort;
    private String name;

    public SortEnum stringToEnum(String sort) {
        try {
            return SortEnum.valueOf(sort.toUpperCase());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }
}
