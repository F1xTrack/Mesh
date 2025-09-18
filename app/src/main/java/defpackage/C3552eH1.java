package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: eH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3552eH1 implements InterfaceC6053nJ1, InterfaceC5441k61 {
    public final /* synthetic */ int a;

    public /* synthetic */ C3552eH1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        return AbstractC3782fU1.e((List) obj);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 0:
                PW1.b.get();
                return (String) UW1.B.a();
            default:
                C4179hZ1.b.get();
                Boolean bool = (Boolean) C6101nZ1.f.a();
                bool.getClass();
                return bool;
        }
    }
}
