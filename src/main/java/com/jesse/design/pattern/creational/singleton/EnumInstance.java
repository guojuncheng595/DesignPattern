package com.jesse.design.pattern.creational.singleton;

/**
 * @author Jesse Guo
 * @Title: EnumInstance
 * @ProjectName design_course
 * @Description: 使用枚举实现单利
 * @date 2019/4/316:56
 */
public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("Gjc Print Test!");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
