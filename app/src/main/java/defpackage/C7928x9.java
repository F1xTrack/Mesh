package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* renamed from: x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7928x9 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3272cp0 b;
    public final /* synthetic */ InterfaceC0687Io0 c;

    public /* synthetic */ C7928x9(InterfaceC0687Io0 interfaceC0687Io0, C3272cp0 c3272cp0, int i) {
        this.a = i;
        this.c = interfaceC0687Io0;
        this.b = c3272cp0;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                ((WB) this.c).getClass();
                C3272cp0 c3272cp0 = this.b;
                c3272cp0.getClass();
                if (AbstractC0277Dh1.a >= 30) {
                    c3272cp0.a(j);
                    break;
                } else {
                    Handler handler = c3272cp0.a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                ((C5772lr0) this.c).getClass();
                C3272cp0 c3272cp02 = this.b;
                c3272cp02.getClass();
                if (AbstractC0277Dh1.a >= 30) {
                    c3272cp02.a(j);
                    break;
                } else {
                    Handler handler2 = c3272cp02.a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
