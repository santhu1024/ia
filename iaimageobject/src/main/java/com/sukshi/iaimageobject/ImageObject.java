package com.sukshi.iaimageobject;

import android.hardware.Camera;

public class ImageObject {

    public byte[] byteArray;
    public int previewW, previewH;
    public Camera.Parameters parameters;

    public ImageObject(byte[] byteArray, int previewW, int previewH, Camera.Parameters parameters) {
        this.byteArray = byteArray;
        this.previewW = previewW;
        this.previewH = previewH;
        this.parameters = parameters;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public int getPreviewW() {
        return previewW;
    }

    public int getPreviewH() {
        return previewH;
    }
}
