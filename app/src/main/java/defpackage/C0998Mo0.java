package defpackage;

import android.media.MediaCodec;

/* renamed from: Mo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0998Mo0 extends XD {
    public final int a;

    public C0998Mo0(IllegalStateException illegalStateException, C1076No0 c1076No0) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(c1076No0 == null ? null : c1076No0.a);
        super(sb.toString(), illegalStateException);
        int i = AbstractC0277Dh1.a;
        if (i >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = i >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC0277Dh1.w(diagnosticInfo);
    }
}
