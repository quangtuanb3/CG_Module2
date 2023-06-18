class StringBuilderWriter implements Runnable {
    private StringBuilder stringBuilder;

    public StringBuilderWriter(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        // Thực hiện thêm nội dung vào StringBuffer
        for (int i = 1; i <= 10; i=i+2) {
            stringBuilder.append(i + " ");
            try {
                Thread.sleep(100); // Dừng 100ms để tạo ra xung đột dữ liệu
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // In nội dung của StringBuffer
        System.out.println(stringBuilder.toString());
    }
}