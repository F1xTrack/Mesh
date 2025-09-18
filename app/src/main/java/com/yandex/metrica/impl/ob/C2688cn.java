package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.cn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2688cn {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2688cn c;
    private final Context a;
    private final Map<String, C2638an> b = new HashMap();

    public C2688cn(Context context) {
        this.a = context;
    }

    public static C2688cn a(Context context) {
        if (c == null) {
            synchronized (C2688cn.class) {
                try {
                    if (c == null) {
                        c = new C2688cn(context);
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public C2638an a(String str) {
        if (!this.b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.b.containsKey(str)) {
                        this.b.put(str, new C2638an(new ReentrantLock(), new C2663bn(this.a, str)));
                    }
                } finally {
                }
            }
        }
        return this.b.get(str);
    }
}
