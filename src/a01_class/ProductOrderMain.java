package a01_class;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOrderMain {
    public static void main(String[] args) {
        /**
         * - 문제
         *      1. 여러 상품의 주문 정보를 배열로 관리
         *      2. 그 정보들을 출력
         *      3. 최종 결제 금액을 계산하여 출력
         */

        int total = 0;

        ArrayList<ProductOrder> orders = new ArrayList<>();
        orders.add(new ProductOrder("마우스", 10000, 2));
        orders.add(new ProductOrder("키보드", 50000, 1));
        orders.add(new ProductOrder("모니터", 150000, 1));

        for(ProductOrder order : orders) {
            System.out.printf("상품명: %s\n가격: %d\n수량: %d\n", order.productName, order.price, order.quantity);

            total += order.price * order.quantity;
        }

        System.out.println("총 상품 금액: " + total);

    }
}
