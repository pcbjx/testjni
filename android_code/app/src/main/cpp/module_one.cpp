//
// Created by admin on 2019/7/11.
//

#include "module_one.h"

module_one::module_one() {
    m_value = 0;
}

module_one::~module_one() {

}

int module_one::getvalue() {
    return m_value;
}

void module_one::setvalue(int u32_v) {
    m_value = u32_v;
}