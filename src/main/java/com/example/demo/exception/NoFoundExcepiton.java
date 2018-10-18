package com.example.demo.exception;

/**
 * Created by Admin on 2018/10/18.
 */
public class NoFoundExcepiton extends Exception{
    private static final long serialVersionUID = -5955607821816077172L;

    public NoFoundExcepiton(String errorInfo) {
        super(errorInfo);
    }

}
