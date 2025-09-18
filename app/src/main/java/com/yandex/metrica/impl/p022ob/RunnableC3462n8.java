package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p021ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.n8 */
/* loaded from: classes2.dex */
public class RunnableC3462n8 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
