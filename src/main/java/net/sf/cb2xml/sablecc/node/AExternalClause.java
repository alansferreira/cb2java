/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AExternalClause extends PExternalClause
{
    private TExternal _external_;

    public AExternalClause ()
    {
    }

    public AExternalClause (TExternal _external_)
    {
        setExternal (_external_);
    }

    public Object clone ()
    {
        return new AExternalClause((TExternal) cloneNode (_external_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAExternalClause (this);
    }

    public TExternal getExternal ()
    {
        return _external_;
    }

    public void setExternal (TExternal node)
    {
        if (_external_ != null)
        {
            _external_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _external_ = node;
    }

    public String toString ()
    {
        return "" + toString (_external_);
    }

    void removeChild (Node child)
    {
        if (_external_ == child)
        {
            _external_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_external_ == oldChild)
        {
            setExternal ((TExternal) newChild);

            return;
        }
    }
}