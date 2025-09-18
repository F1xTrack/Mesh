package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.n8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC2947n8 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
