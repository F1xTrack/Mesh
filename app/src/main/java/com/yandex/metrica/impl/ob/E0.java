package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public enum E0 {
    UNDEFINED("UNDEFINED"),
    APP(GrsBaseInfo.CountryCodeSource.APP),
    SATELLITE("SATELLITE"),
    RETAIL("RETAIL");

    public static final a g = new a(null);
    private final String a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    E0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
