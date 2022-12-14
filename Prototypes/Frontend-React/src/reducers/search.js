import { SUCCESS_SEARCH_BY_WORD_REQUEST } from "../actions/types";

const initialState = {
    data: [],
    error: {}
};

export default function (state = initialState, action) {
    const { type, payload } = action;

    switch (type) {
        case SUCCESS_SEARCH_BY_WORD_REQUEST:
            return {
                ...state,
                data: payload,
            };
        default:
            return state;
    }
}