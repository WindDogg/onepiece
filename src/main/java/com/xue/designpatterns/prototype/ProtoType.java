package com.xue.designpatterns.prototype;

import java.io.*;

public class ProtoType implements Cloneable,Serializable {
    private static final long serialVersionUID = 1L;

    private String string;

    private  SerializableObject obj;

    //浅复制
    public Object clone() throws CloneNotSupportedException {
        ProtoType protoType = (ProtoType) super.clone();
        return protoType;
    }

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读取二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    class SerializableObject implements java.io.Serializable {
        private  static  final long serivalVersionUID = 1L;
    }
}
