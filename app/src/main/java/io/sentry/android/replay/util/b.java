package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import defpackage.AbstractC7538v51;
import defpackage.O90;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b {
    public static final Rect a(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        O90.f(layoutCoordinates, "<this>");
        if (layoutCoordinates2 == null) {
            layoutCoordinates2 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        }
        float f = IntSize.getWidth-impl(layoutCoordinates2.getSize-YbymL2g());
        float f2 = IntSize.getHeight-impl(layoutCoordinates2.getSize-YbymL2g());
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, (Object) null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > f) {
            left = f;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f2) {
            top = f2;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= f) {
            f = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f3 = bottom >= 0.0f ? bottom : 0.0f;
        if (f3 <= f2) {
            f2 = f3;
        }
        if (left == f || top == f2) {
            return new Rect();
        }
        long j = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, top));
        long j2 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f, top));
        long j3 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f, f2));
        long j4 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, f2));
        float f4 = Offset.getX-impl(j);
        float f5 = Offset.getX-impl(j2);
        float f6 = Offset.getX-impl(j4);
        float f7 = Offset.getX-impl(j3);
        float fMin = Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        float fMax = Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        float f8 = Offset.getY-impl(j);
        float f9 = Offset.getY-impl(j2);
        float f10 = Offset.getY-impl(j4);
        float f11 = Offset.getY-impl(j3);
        return new Rect((int) fMin, (int) Math.min(f8, Math.min(f9, Math.min(f10, f11))), (int) fMax, (int) Math.max(f8, Math.max(f9, Math.max(f10, f11))));
    }

    public static final Painter b(LayoutNode layoutNode) {
        O90.f(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            if (AbstractC7538v51.p(modifier.getClass().getName(), "Painter", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static final c c(LayoutNode layoutNode) {
        ColorProducer colorProducer;
        O90.f(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color color = null;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            String name = modifier.getClass().getName();
            if (AbstractC7538v51.p(name, "Text", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                } catch (Throwable unused) {
                }
                color = colorProducer != null ? Color.box-impl(colorProducer.invoke-0d7_KjU()) : null;
            } else if (AbstractC7538v51.p(name, "Fill", false)) {
                z = true;
            }
        }
        return new c(color, z);
    }

    public static final boolean d(Painter painter) {
        String name = painter.getClass().getName();
        return (AbstractC7538v51.p(name, "Vector", false) || AbstractC7538v51.p(name, RemoteMessageAttributes.COLOR, false) || AbstractC7538v51.p(name, "Brush", false)) ? false : true;
    }
}
