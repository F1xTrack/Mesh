package p000;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: eH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9222eH1 implements InterfaceC10378nJ1, InterfaceC9968k61 {

    /* renamed from: a */
    public final /* synthetic */ int f26649a;

    public /* synthetic */ C9222eH1(int i) {
        this.f26649a = i;
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        return AbstractC9376fU1.m18244e((List) obj);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f26649a) {
            case 0:
                PW1.f9104b.get();
                return (String) UW1.f11834B.m8754a();
            default:
                C9642hZ1.f28461b.get();
                Boolean bool = (Boolean) C10410nZ1.f38374f.m8754a();
                bool.getClass();
                return bool;
        }
    }
}
