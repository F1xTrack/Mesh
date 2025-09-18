package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class E0 implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C4611i1 b;

    public E0(C4611i1 c4611i1, Intent intent) {
        this.b = c4611i1;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5023z7 c5023z7 = this.b.d().b;
        Intent intent = this.a;
        c5023z7.getClass();
        if (intent != null) {
            c5023z7.a(intent.getDataString(), false);
        }
    }
}
