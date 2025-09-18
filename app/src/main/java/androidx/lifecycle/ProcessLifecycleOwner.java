package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import p000.AbstractC7538Ei0;
import p000.C8342Tu0;
import p000.EnumC7382Bi0;
import p000.InterfaceC7902Li0;
import p000.O90;
import p000.RunnableC8352Tz0;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m22267d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "LLi0;", "<init>", "()V", "ED0", "lifecycle-process_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC7902Li0 {

    /* renamed from: i */
    public static final ProcessLifecycleOwner f16292i = new ProcessLifecycleOwner();

    /* renamed from: a */
    public int f16293a;

    /* renamed from: b */
    public int f16294b;

    /* renamed from: e */
    public Handler f16297e;

    /* renamed from: c */
    public boolean f16295c = true;

    /* renamed from: d */
    public boolean f16296d = true;

    /* renamed from: f */
    public final C1742a f16298f = new C1742a(this);

    /* renamed from: g */
    public final RunnableC8352Tz0 f16299g = new RunnableC8352Tz0(3, this);

    /* renamed from: h */
    public final C8342Tu0 f16300h = new C8342Tu0(23, this);

    private ProcessLifecycleOwner() {
    }

    /* renamed from: a */
    public final void m10122a() {
        int i = this.f16294b + 1;
        this.f16294b = i;
        if (i == 1) {
            if (this.f16295c) {
                this.f16298f.m10126e(EnumC7382Bi0.ON_RESUME);
                this.f16295c = false;
            } else {
                Handler handler = this.f16297e;
                O90.m5965c(handler);
                handler.removeCallbacks(this.f16299g);
            }
        }
    }

    @Override // p000.InterfaceC7902Li0
    public final AbstractC7538Ei0 getLifecycle() {
        return this.f16298f;
    }
}
