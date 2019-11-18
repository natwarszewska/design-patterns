package patterns.structural.proxy.impl;

public class ProxyMediaFile implements MediaFile {

    private MediaFileImpl mediaFileImpl;
    private String fileName;

    public ProxyMediaFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void printName() {
        if(mediaFileImpl == null){
            mediaFileImpl = new MediaFileImpl(fileName);
        }
        mediaFileImpl.printName();
    }
}
