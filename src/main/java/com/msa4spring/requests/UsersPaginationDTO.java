package com.msa4spring.requests;

public record UsersPaginationDTO(
    int page
    ,int limit
) {
//    public UsersPaginationDTO(String page, String limit) {
//        this.page = (page == null || page.isBlank()) ? "1" : page;
//        this.limit = (limit == null || limit.isBlank()) ? "10" : limit;
//    }
}
