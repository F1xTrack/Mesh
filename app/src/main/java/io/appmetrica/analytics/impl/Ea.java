package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes2.dex */
public interface Ea {
    Ea a(int i, String str);

    Ea a(String str, float f);

    Ea a(String str, long j);

    Ea a(String str, String str2);

    Ea a(String str, boolean z);

    Set a();

    boolean a(String str);

    void b();

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    Ea remove(String str);
}
