package defpackage;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.animated.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: cu0 */
/* loaded from: classes.dex */
public final class C3287cu0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public C3287cu0(int i, String str, ReadableMap readableMap) {
        this.c = i;
        this.d = str;
        this.e = readableMap;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        switch (this.b) {
            case 0:
                aVar.a(this.c, (String) this.d, (ReadableMap) this.e);
                return;
            default:
                NativeAnimatedModule nativeAnimatedModule = (NativeAnimatedModule) this.e;
                nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
                int i = 0;
                while (i < this.c) {
                    int i2 = i + 1;
                    ReadableArray readableArray = (ReadableArray) this.d;
                    int i3 = readableArray.getInt(i);
                    if (NX.a == null) {
                        NX.a = AbstractC8235ym.C(21);
                    }
                    switch (AbstractC8235ym.x(NX.a[i3 - 1])) {
                        case 0:
                            int i4 = i + 2;
                            i += 3;
                            aVar.d(readableArray.getInt(i2), readableArray.getMap(i4));
                            break;
                        case 1:
                            int i5 = i + 2;
                            i += 3;
                            aVar.u(readableArray.getInt(i2), readableArray.getMap(i5));
                            break;
                        case 2:
                            i += 2;
                            aVar.j(readableArray.getInt(i2), null);
                            break;
                        case 3:
                            i += 2;
                            int i6 = readableArray.getInt(i2);
                            aVar.q(i6, new C1204Pf(this, i6, 12));
                            break;
                        case 4:
                            i += 2;
                            aVar.t(readableArray.getInt(i2));
                            break;
                        case 5:
                            int i7 = i + 2;
                            i += 3;
                            aVar.c(readableArray.getInt(i2), readableArray.getInt(i7));
                            break;
                        case 6:
                            int i8 = i + 2;
                            i += 3;
                            aVar.f(readableArray.getInt(i2), readableArray.getInt(i8));
                            break;
                        case 7:
                            if (((C4375ib0) AbstractC6792rB1.a).lazyAnimationCallbacks()) {
                                nativeAnimatedModule.enqueueFrameCallback();
                            }
                            int i9 = readableArray.getInt(i2);
                            int i10 = i + 3;
                            int i11 = readableArray.getInt(i + 2);
                            i += 4;
                            aVar.p(i9, readableArray.getMap(i10), null, i11);
                            break;
                        case 8:
                            i += 2;
                            aVar.r(readableArray.getInt(i2));
                            break;
                        case 9:
                            int i12 = i + 2;
                            i += 3;
                            aVar.o(readableArray.getInt(i2), readableArray.getDouble(i12));
                            break;
                        case 10:
                            int i13 = i + 2;
                            i += 3;
                            aVar.o(readableArray.getInt(i2), readableArray.getDouble(i13));
                            break;
                        case 11:
                            i += 2;
                            aVar.h(readableArray.getInt(i2));
                            break;
                        case 12:
                            i += 2;
                            aVar.g(readableArray.getInt(i2));
                            break;
                        case 13:
                            int i14 = i + 2;
                            i += 3;
                            aVar.b(readableArray.getInt(i2), readableArray.getInt(i14));
                            break;
                        case 14:
                            int i15 = i + 2;
                            int i16 = readableArray.getInt(i2);
                            i += 3;
                            int i17 = readableArray.getInt(i15);
                            nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i17);
                            aVar.e(i16, i17);
                            break;
                        case 15:
                            i += 2;
                            aVar.m(readableArray.getInt(i2));
                            break;
                        case 16:
                            i += 2;
                            int i18 = readableArray.getInt(i2);
                            aVar.a.remove(i18);
                            aVar.c.remove(i18);
                            break;
                        case 17:
                            int i19 = readableArray.getInt(i2);
                            int i20 = i + 3;
                            String string = readableArray.getString(i + 2);
                            i += 4;
                            aVar.a(i19, string, readableArray.getMap(i20));
                            break;
                        case 18:
                            int i21 = readableArray.getInt(i2);
                            nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i21);
                            int i22 = i + 3;
                            String string2 = readableArray.getString(i + 2);
                            i += 4;
                            aVar.l(i21, readableArray.getInt(i22), string2);
                            break;
                        case 19:
                        case 20:
                            i += 2;
                            break;
                        default:
                            throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                    }
                }
                return;
        }
    }

    public C3287cu0(NativeAnimatedModule nativeAnimatedModule, int i, ReadableArray readableArray) {
        this.e = nativeAnimatedModule;
        this.c = i;
        this.d = readableArray;
    }
}
