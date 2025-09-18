package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import p000.AbstractC3912dB;
import p000.C0305Eq;
import p000.C6898td;
import p000.InterfaceC8255Sc1;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC8255Sc1 create(AbstractC3912dB abstractC3912dB) {
        Context context = ((C6898td) abstractC3912dB).f43174a;
        C6898td c6898td = (C6898td) abstractC3912dB;
        return new C0305Eq(context, c6898td.f43175b, c6898td.f43176c);
    }
}
