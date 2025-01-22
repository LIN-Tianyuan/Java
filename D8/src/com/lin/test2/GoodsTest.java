package com.lin.test2;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class GoodsTest {
    public static void main(String[] args) {
        // 1. Create an array
        Goods[] arr = new Goods[3];

        // 2. Create three commodity objects
        Goods g1 = new Goods("001","Huawei P40",5999.0,100);
        Goods g2 = new Goods("002","Thermos",227.0,50);
        Goods g3 = new Goods("003","Wolf berry",12.7,70);

        // 3. Add the product to the array
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        // 4. Iteration
        for (int i = 0; i < arr.length; i++) {
            // i index arr[i] element
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }
}
