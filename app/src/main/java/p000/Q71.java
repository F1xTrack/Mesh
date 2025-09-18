package p000;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q71 {

    /* renamed from: a */
    public Message f9486a;

    /* renamed from: a */
    public final void m6575a() {
        this.f9486a = null;
        ArrayList arrayList = R71.f10019b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    /* renamed from: b */
    public final void m6576b() {
        Message message = this.f9486a;
        message.getClass();
        message.sendToTarget();
        m6575a();
    }
}
