package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.network.NetworkingModule;
import java.io.IOException;

/* renamed from: Uk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1609Uk extends FX {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ IS0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609Uk(C4306iE0 c4306iE0, InterfaceC0827Kj interfaceC0827Kj) {
        super(interfaceC0827Kj);
        this.c = c4306iE0;
    }

    @Override // defpackage.FX, defpackage.U21
    public long H(C6129nj c6129nj, long j) {
        switch (this.b) {
            case 1:
                long jH = super.H(c6129nj, 8192L);
                C4306iE0 c4306iE0 = (C4306iE0) this.c;
                long j2 = c4306iE0.d + (jH != -1 ? jH : 0L);
                c4306iE0.d = j2;
                C5402jv0 c5402jv0 = c4306iE0.b;
                long jO = c4306iE0.a.o();
                boolean z = jH == -1;
                c5402jv0.getClass();
                long jNanoTime = System.nanoTime();
                if ((z || NetworkingModule.shouldDispatch(jNanoTime, c5402jv0.a)) && !c5402jv0.b.equals("text")) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushInt(c5402jv0.d);
                    writableArrayCreateArray.pushInt((int) j2);
                    writableArrayCreateArray.pushInt((int) jO);
                    ReactApplicationContext reactApplicationContext = c5402jv0.c;
                    if (reactApplicationContext != null) {
                        reactApplicationContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
                    }
                    c5402jv0.a = jNanoTime;
                }
                return jH;
            default:
                return super.H(c6129nj, j);
        }
    }

    @Override // defpackage.FX, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.b) {
            case 0:
                ((C1687Vk) this.c).a.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609Uk(U21 u21, C1687Vk c1687Vk) {
        super(u21);
        this.c = c1687Vk;
    }
}
