package com.yandex.metrica.plugins;

/* loaded from: classes2.dex */
public class StackTraceItem {

    /* renamed from: a */
    public final String f25494a;

    /* renamed from: b */
    public final String f25495b;

    /* renamed from: c */
    public final Integer f25496c;

    /* renamed from: d */
    public final Integer f25497d;

    /* renamed from: e */
    public final String f25498e;

    public static class Builder {

        /* renamed from: a */
        public String f25499a;

        /* renamed from: b */
        public String f25500b;

        /* renamed from: c */
        public Integer f25501c;

        /* renamed from: d */
        public Integer f25502d;

        /* renamed from: e */
        public String f25503e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f25499a, this.f25500b, this.f25501c, this.f25502d, this.f25503e);
        }

        public Builder withClassName(String str) {
            this.f25499a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f25502d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f25500b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f25501c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f25503e = str;
            return this;
        }
    }

    public StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f25494a = str;
        this.f25495b = str2;
        this.f25496c = num;
        this.f25497d = num2;
        this.f25498e = str3;
    }

    public String getClassName() {
        return this.f25494a;
    }

    public Integer getColumn() {
        return this.f25497d;
    }

    public String getFileName() {
        return this.f25495b;
    }

    public Integer getLine() {
        return this.f25496c;
    }

    public String getMethodName() {
        return this.f25498e;
    }
}
