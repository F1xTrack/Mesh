package p000;

import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;

/* renamed from: kj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10046kj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f36644e;

    /* renamed from: f */
    public final /* synthetic */ C11326uj1 f36645f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f36646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10046kj1(C11326uj1 c11326uj1, ArrayList arrayList, int i) {
        super(1);
        this.f36644e = i;
        this.f36645f = c11326uj1;
        this.f36646g = arrayList;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f36644e) {
            case 0:
                WritableMap writableMap = (WritableMap) obj;
                O90.m5968f(writableMap, "$this$dispatch");
                writableMap.putArray("audioTracks", C11326uj1.m25226a(this.f36645f, this.f36646g));
                break;
            case 1:
                WritableMap writableMap2 = (WritableMap) obj;
                O90.m5968f(writableMap2, "$this$dispatch");
                writableMap2.putArray("textTracks", C11326uj1.m25227b(this.f36645f, this.f36646g));
                break;
            default:
                WritableMap writableMap3 = (WritableMap) obj;
                O90.m5968f(writableMap3, "$this$dispatch");
                writableMap3.putArray("videoTracks", C11326uj1.m25228c(this.f36645f, this.f36646g));
                break;
        }
        return C8313Tf1.f11463a;
    }
}
