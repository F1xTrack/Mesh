package defpackage;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

/* renamed from: Nu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1095Nu1 implements InterfaceC0703It1 {
    public final ExceptionProcessor a;

    public C1095Nu1(Context context) {
        this.a = new ExceptionProcessor(context, new C3279cr1());
    }

    @Override // defpackage.InterfaceC0703It1
    public final void reportException(String str, Throwable th) {
        try {
            this.a.onException(str, th);
        } catch (Throwable unused) {
        }
    }
}
