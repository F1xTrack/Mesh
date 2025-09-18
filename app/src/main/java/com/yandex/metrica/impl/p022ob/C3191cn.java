package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.cn */
/* loaded from: classes2.dex */
public class C3191cn {

    /* renamed from: c */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3191cn f23198c;

    /* renamed from: a */
    private final Context f23199a;

    /* renamed from: b */
    private final Map<String, C3139an> f23200b = new HashMap();

    public C3191cn(Context context) {
        this.f23199a = context;
    }

    /* renamed from: a */
    public static C3191cn m15718a(Context context) {
        if (f23198c == null) {
            synchronized (C3191cn.class) {
                try {
                    if (f23198c == null) {
                        f23198c = new C3191cn(context);
                    }
                } finally {
                }
            }
        }
        return f23198c;
    }

    /* renamed from: a */
    public C3139an m15719a(String str) {
        if (!this.f23200b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f23200b.containsKey(str)) {
                        this.f23200b.put(str, new C3139an(new ReentrantLock(), new C3165bn(this.f23199a, str)));
                    }
                } finally {
                }
            }
        }
        return this.f23200b.get(str);
    }
}
