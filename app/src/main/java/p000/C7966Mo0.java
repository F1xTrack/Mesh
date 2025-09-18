package p000;

import android.media.MediaCodec;

/* renamed from: Mo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7966Mo0 extends AbstractC1461XD {

    /* renamed from: a */
    public final int f7359a;

    public C7966Mo0(IllegalStateException illegalStateException, C8018No0 c8018No0) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(c8018No0 == null ? null : c8018No0.f8009a);
        super(sb.toString(), illegalStateException);
        int i = AbstractC7485Dh1.f2166a;
        if (i >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f7359a = i >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC7485Dh1.m1838w(diagnosticInfo);
    }
}
