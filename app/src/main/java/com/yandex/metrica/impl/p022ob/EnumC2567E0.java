package com.yandex.metrica.impl.p022ob;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.yandex.metrica.impl.ob.E0 */
/* loaded from: classes2.dex */
public enum EnumC2567E0 {
    UNDEFINED("UNDEFINED"),
    APP(GrsBaseInfo.CountryCodeSource.APP),
    SATELLITE("SATELLITE"),
    RETAIL("RETAIL");


    /* renamed from: g */
    public static final a f21069g = new a(null);

    /* renamed from: a */
    private final String f21070a;

    /* renamed from: com.yandex.metrica.impl.ob.E0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EnumC2567E0(String str) {
        this.f21070a = str;
    }

    /* renamed from: a */
    public final String m14026a() {
        return this.f21070a;
    }
}
