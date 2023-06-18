public class StringBufferSync {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        // Tạo hai luồng
        Thread threadBuffer1 = new Thread(new StringBufferWriter(stringBuffer));
        Thread threadBuffer2 = new Thread(new StringBufferWriter(stringBuffer));

        StringBuilder stringBuilder = new StringBuilder();

        // Tạo hai luồng
        Thread threadBuilder1 = new Thread(new StringBuilderWriter(stringBuilder));
        Thread threadBuilder2 = new Thread(new StringBuilderWriter(stringBuilder));

        // Khởi chạy các luồng
        System.out.println(">>>>>Buffer");
        threadBuffer1.start();
        threadBuffer2.start();

        System.out.println(">>>>>Buider");
        threadBuilder1.start();
        threadBuilder2.start();
    }
}