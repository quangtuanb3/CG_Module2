class StringBufferWriter implements Runnable {
    private StringBuffer stringBuffer;

    public StringBufferWriter(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    @Override
    public void run() {
        // Thực hiện thêm nội dung vào StringBuffer
        for (int i = 2; i <= 10; i=i+2) {
            stringBuffer.append(i + " ");
            try {
                Thread.sleep(100); // Dừng 100ms để tạo ra xung đột dữ liệu
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // In nội dung của StringBuffer
        System.out.println(stringBuffer.toString());
    }
}