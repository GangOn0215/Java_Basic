package a01_class;

public class ProductOrderMain {
    public static void main(String[] args) {
        /**
         * - 문제
         *      1. 여러 상품의 주문 정보를 배열로 관리
         *      2. 그 정보들을 출력
         *      3. 최종 결제 금액을 계산하여 출력
         */

        ProductOrder[] orders = new ProductOrder[3];
        int total = 0;

        for (int i = 0; i < orders.length; i++) {
            orders[i] = new ProductOrder();
        }

        orders[0].productName = "마우스";
        orders[0].price = 10000;
        orders[0].quantity = 2;

        orders[1].productName = "키보드";
        orders[1].price = 50000;
        orders[1].quantity = 1;

        orders[2].productName = "모니터";
        orders[2].price = 150000;
        orders[2].quantity = 1;

        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품 명: " + orders[i].productName + "\n가격: " + orders[i].price + "\n수량: " + orders[i].quantity);

            total += orders[i].price * orders[i].quantity;
        }

        System.out.println("총 상품 금액: " + total);

    }
}
