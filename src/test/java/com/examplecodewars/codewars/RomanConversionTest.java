package com.examplecodewars.codewars;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class RomanConversionTest {
    private RomanConversion conversion = new RomanConversion();

    @Test
    public void shouldConvertToRoman() {
        Integer c = 324;
        Double f = 324d;

        BigDecimal bigDecimal = BigDecimal.valueOf(c / 100);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(f / 100);

        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
//        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
//        assertEquals("solution(4) should equal to IV", "III", conversion.solution(3));
//        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    }

    @Test
    public void contextLoads() {
//        List<String> carst = Lists.newArrayList("fiat", "bmw");
//        carst.forEach(cartItem ->
//                getSomeString()
//                        .filter(somestr -> !CollectionUtils.isEmpty(somestr))
//                        .ifPresent(product -> {
//                           System.out.print(product);
//                        })
//        );
//
//
//        cartItems.forEach(cartItem ->
//                productService.getResourceProduct(cartItem.getEan(), shopCode.name())
//                        .filter(product -> !CollectionUtils.isEmpty(product.getAssetImages()))
//                        .ifPresent(product -> {
//                            CartProduct cartProduct = new CartProduct();
//                            setImageToCartItem(product, cartProduct);
//                            cartItem.setProduct(cartProduct);
//                        })
//        );

    }

    String getSomeString() {
        return "st";
    }
}