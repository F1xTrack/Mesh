package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Qx */
/* loaded from: classes.dex */
public final class C1067Qx {

    /* renamed from: a */
    public final float f9869a;

    /* renamed from: b */
    public final float f9870b;

    /* renamed from: c */
    public final float f9871c;

    /* renamed from: d */
    public final float f9872d;

    /* renamed from: e */
    public final int f9873e;

    public C1067Qx(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f9869a = Float.NaN;
        this.f9870b = Float.NaN;
        this.f9871c = Float.NaN;
        this.f9872d = Float.NaN;
        this.f9873e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), TG0.f11280i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f9873e);
                this.f9873e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1570Yx().m9434b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9872d = typedArrayObtainStyledAttributes.getDimension(index, this.f9872d);
            } else if (index == 2) {
                this.f9870b = typedArrayObtainStyledAttributes.getDimension(index, this.f9870b);
            } else if (index == 3) {
                this.f9871c = typedArrayObtainStyledAttributes.getDimension(index, this.f9871c);
            } else if (index == 4) {
                this.f9869a = typedArrayObtainStyledAttributes.getDimension(index, this.f9869a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
