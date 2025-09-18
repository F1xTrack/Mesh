package p000;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

/* renamed from: Nu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8031Nu1 implements InterfaceC7769It1 {

    /* renamed from: a */
    public final ExceptionProcessor f8126a;

    public C8031Nu1(Context context) {
        this.f8126a = new ExceptionProcessor(context, new C9038cr1());
    }

    @Override // p000.InterfaceC7769It1
    public final void reportException(String str, Throwable th) {
        try {
            this.f8126a.onException(str, th);
        } catch (Throwable unused) {
        }
    }
}
