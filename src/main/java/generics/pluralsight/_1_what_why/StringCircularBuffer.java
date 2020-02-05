package generics.pluralsight._1_what_why;

public class StringCircularBuffer {
    private String[] buffer;
    private int readCursor;
    private int writeCursor;

    public StringCircularBuffer(int size) {
        this.buffer = new String[size];
    }

    public boolean offer(String value){
        if(buffer[writeCursor] != null){
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public String poll(){
        String value = buffer[readCursor];
        if(value != null){
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    private int next(int index) {
        return (index+1) % buffer.length;
    }
}
