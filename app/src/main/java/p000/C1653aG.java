package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: aG */
/* loaded from: classes.dex */
public final class C1653aG implements InterfaceC9277ej0 {

    /* renamed from: a */
    public C11891zA0 f15408a;

    @Override // p000.InterfaceC9277ej0
    /* renamed from: a */
    public final void mo9684a(C9405fj0 c9405fj0) {
        String uri = c9405fj0.f27354a.getUri();
        Integer destPageIdx = c9405fj0.f27354a.getDestPageIdx();
        C11891zA0 c11891zA0 = this.f15408a;
        if (uri == null || uri.isEmpty()) {
            if (destPageIdx != null) {
                c11891zA0.m26019l(destPageIdx.intValue());
            }
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
            Context context = c11891zA0.getContext();
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        }
    }
}
