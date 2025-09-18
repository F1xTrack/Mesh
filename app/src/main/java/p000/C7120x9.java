package p000;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* renamed from: x9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C7120x9 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ int f45422a;

    /* renamed from: b */
    public final /* synthetic */ C9033cp0 f45423b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7758Io0 f45424c;

    public /* synthetic */ C7120x9(InterfaceC7758Io0 interfaceC7758Io0, C9033cp0 c9033cp0, int i) {
        this.f45422a = i;
        this.f45424c = interfaceC7758Io0;
        this.f45423b = c9033cp0;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f45422a) {
            case 0:
                ((C1396WB) this.f45424c).getClass();
                C9033cp0 c9033cp0 = this.f45423b;
                c9033cp0.getClass();
                if (AbstractC7485Dh1.f2166a >= 30) {
                    c9033cp0.m17420a(j);
                    break;
                } else {
                    Handler handler = c9033cp0.f25671a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                ((C10189lr0) this.f45424c).getClass();
                C9033cp0 c9033cp02 = this.f45423b;
                c9033cp02.getClass();
                if (AbstractC7485Dh1.f2166a >= 30) {
                    c9033cp02.m17420a(j);
                    break;
                } else {
                    Handler handler2 = c9033cp02.f25671a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
