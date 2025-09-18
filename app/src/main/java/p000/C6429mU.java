package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;

/* renamed from: mU */
/* loaded from: classes2.dex */
public final class C6429mU extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f37724e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f37725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6429mU(ArrayList arrayList, int i) {
        super(1);
        this.f37724e = i;
        this.f37725f = arrayList;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f37724e) {
            case 0:
                String str = (String) obj;
                O90.m5968f(str, "it");
                this.f37725f.add(str);
                return C8313Tf1.f11463a;
            default:
                WritableMap writableMap = (WritableMap) obj;
                O90.m5968f(writableMap, "$this$dispatch");
                WritableArray writableArrayCreateArray = Arguments.createArray();
                int i = 0;
                for (Object obj2 : this.f37725f) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC7230yu.m26279j();
                        throw null;
                    }
                    C11817ya1 c11817ya1 = (C11817ya1) obj2;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("identifier", c11817ya1.f46319a);
                    writableMapCreateMap.putString("value", c11817ya1.f46320b);
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                    i = i2;
                }
                writableMap.putArray("metadata", writableArrayCreateArray);
                return C8313Tf1.f11463a;
        }
    }
}
