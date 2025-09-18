package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.network.NetworkingModule;
import java.io.IOException;

/* renamed from: Uk */
/* loaded from: classes2.dex */
public final class C1305Uk extends AbstractC0349FX {

    /* renamed from: b */
    public final /* synthetic */ int f12014b = 0;

    /* renamed from: c */
    public final /* synthetic */ IS0 f12015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305Uk(C9727iE0 c9727iE0, InterfaceC0676Kj interfaceC0676Kj) {
        super(interfaceC0676Kj);
        this.f12015c = c9727iE0;
    }

    @Override // p000.AbstractC0349FX, p000.U21
    /* renamed from: H */
    public long mo96H(C6507nj c6507nj, long j) {
        switch (this.f12014b) {
            case 1:
                long jMo96H = super.mo96H(c6507nj, 8192L);
                C9727iE0 c9727iE0 = (C9727iE0) this.f12015c;
                long j2 = c9727iE0.f28974d + (jMo96H != -1 ? jMo96H : 0L);
                c9727iE0.f28974d = j2;
                C9941jv0 c9941jv0 = c9727iE0.f28972b;
                long jMo3383o = c9727iE0.f28971a.mo3383o();
                boolean z = jMo96H == -1;
                c9941jv0.getClass();
                long jNanoTime = System.nanoTime();
                if ((z || NetworkingModule.shouldDispatch(jNanoTime, c9941jv0.f35446a)) && !c9941jv0.f35447b.equals("text")) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushInt(c9941jv0.f35449d);
                    writableArrayCreateArray.pushInt((int) j2);
                    writableArrayCreateArray.pushInt((int) jMo3383o);
                    ReactApplicationContext reactApplicationContext = c9941jv0.f35448c;
                    if (reactApplicationContext != null) {
                        reactApplicationContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
                    }
                    c9941jv0.f35446a = jNanoTime;
                }
                return jMo96H;
            default:
                return super.mo96H(c6507nj, j);
        }
    }

    @Override // p000.AbstractC0349FX, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f12014b) {
            case 0:
                ((C1368Vk) this.f12015c).f12708a.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305Uk(U21 u21, C1368Vk c1368Vk) {
        super(u21);
        this.f12015c = c1368Vk;
    }
}
