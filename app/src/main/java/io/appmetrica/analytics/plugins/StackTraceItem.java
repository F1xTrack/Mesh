package io.appmetrica.analytics.plugins;

/* loaded from: classes2.dex */
public class StackTraceItem {

    /* renamed from: a */
    private final String f33162a;

    /* renamed from: b */
    private final String f33163b;

    /* renamed from: c */
    private final Integer f33164c;

    /* renamed from: d */
    private final Integer f33165d;

    /* renamed from: e */
    private final String f33166e;

    public static class Builder {

        /* renamed from: a */
        private String f33167a;

        /* renamed from: b */
        private String f33168b;

        /* renamed from: c */
        private Integer f33169c;

        /* renamed from: d */
        private Integer f33170d;

        /* renamed from: e */
        private String f33171e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f33167a, this.f33168b, this.f33169c, this.f33170d, this.f33171e, 0);
        }

        public Builder withClassName(String str) {
            this.f33167a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f33170d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f33168b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f33169c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f33171e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f33162a;
    }

    public Integer getColumn() {
        return this.f33165d;
    }

    public String getFileName() {
        return this.f33163b;
    }

    public Integer getLine() {
        return this.f33164c;
    }

    public String getMethodName() {
        return this.f33166e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f33162a = str;
        this.f33163b = str2;
        this.f33164c = num;
        this.f33165d = num2;
        this.f33166e = str3;
    }
}
