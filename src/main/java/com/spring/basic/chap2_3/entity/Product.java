package com.spring.basic.chap2_3.entity;

import lombok.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor // 기본생성자
@AllArgsConstructor

//@Data
public class Product {

    private Long serialNo; //상품 시리얼번호
    private String name; // 상품명
    private int price; // 상품가격
}
