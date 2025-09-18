package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.HashMap;

/* renamed from: LS */
/* loaded from: classes.dex */
public final class C0721LS extends AbstractC6620pU {

    /* renamed from: c */
    public String f6631c;

    /* renamed from: d */
    public float f6632d;

    /* renamed from: e */
    public float f6633e;

    @Override // p000.AbstractC6620pU
    /* renamed from: l */
    public final Bitmap mo4327l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapM23802m = AbstractC6620pU.m23802m(map, bitmap, this.f6631c);
        Context context = getContext();
        float fMax = Math.max(this.f6632d, this.f6633e) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmapM23802m;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM23802m);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapM23802m);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapM23802m.getWidth(), bitmapM23802m.getHeight(), false);
    }
}
