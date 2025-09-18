package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: aG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2100aG implements InterfaceC3635ej0 {
    public C8312zA0 a;

    @Override // defpackage.InterfaceC3635ej0
    public final void a(C3826fj0 c3826fj0) {
        String uri = c3826fj0.a.getUri();
        Integer destPageIdx = c3826fj0.a.getDestPageIdx();
        C8312zA0 c8312zA0 = this.a;
        if (uri == null || uri.isEmpty()) {
            if (destPageIdx != null) {
                c8312zA0.l(destPageIdx.intValue());
            }
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
            Context context = c8312zA0.getContext();
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        }
    }
}
